import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaRespuesta extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="border: 1px solid black; align-items: stretch; padding-bottom: var(--lumo-space-l); padding-left: var(--lumo-space-l); padding-right: var(--lumo-space-l);">
 <h4 id="h-respuesta" style="flex-grow: 0;">Usuario: </h4>
 <label id="label-mensaje">Mensaje</label>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-respuesta';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaRespuesta.is, VistaRespuesta);
