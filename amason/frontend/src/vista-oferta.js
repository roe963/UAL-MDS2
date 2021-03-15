import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaOferta extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 18%; height: 26%;">
 <label style="flex-shrink: 1; align-self: center;">Fecha</label>
 <img style="flex-grow: 0; padding: var(--lumo-space-xl); align-self: center;">
 <label style="flex-shrink: 1; align-self: center;">Precio</label>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-oferta';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaOferta.is, VistaOferta);
