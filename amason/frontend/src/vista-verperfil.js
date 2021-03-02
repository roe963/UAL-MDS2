import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-verperfil`
 *
 * VistaVerperfil element.
 *
 * @customElement
 * @polymer
 */
class VistaVerperfil extends PolymerElement {

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
        return 'vista-verperfil';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVerperfil.is, VistaVerperfil);
