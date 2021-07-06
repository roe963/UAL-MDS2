import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-encargadodecompras.js';

class VistaEncargadosdecompras extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="align-items: stretch;" id="layout-encargadosCompras">
 <vista-encargadodecompras id="vistaEncargadodecompras" style="align-self: stretch;"></vista-encargadodecompras>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-encargadosdecompras';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaEncargadosdecompras.is, VistaEncargadosdecompras);
