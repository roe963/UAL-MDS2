import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-buscarproductocliente`
 *
 * VistaBuscarproductocliente element.
 *
 * @customElement
 * @polymer
 */
class VistaBuscarproductocliente extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'vista-buscarproductocliente';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaBuscarproductocliente.is, VistaBuscarproductocliente);
